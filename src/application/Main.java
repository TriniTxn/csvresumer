package application;

import entities.items.Products;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Products> list = new ArrayList<>();

        // Seleção do arquivo e do diretório de destino pós execução do programa
        String sourceFileStr = "C:\\Users\\Piticas\\Downloads\\Any.csv";

        File sourceFile = new File(sourceFileStr);
        String sourceFolderStr = sourceFile.getParent();

        // Criação do arquivo
        boolean success = new File(sourceFolderStr + "\\out").mkdir();

        String targetFileStr = sourceFolderStr + "\\out\\esseteste.csv";

        // Leitura e armazenamento de cada um dos campos do csv específico
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
            String itemCsv = br.readLine();
            while (itemCsv != null) {
                String[] fields = itemCsv.split(";");
                String codEmpFatura = fields[0];
                String nf = fields[1];
                String dtEmissao = fields[2];
                String dtTransac = fields[3];
                String codSerie = fields[4];
                String nrTransac = fields[5];
                String nrSeqfecha = fields[6];
                String codLicenciado = fields[7];
                String valRoyalties = fields[8];
                String nome = fields[9];
                String codCondpgto = fields[13];

                list.add(new Products(codEmpFatura, nf, dtEmissao, dtTransac, codSerie, nrTransac, nrSeqfecha, codLicenciado, valRoyalties, nome, codCondpgto));

                itemCsv = br.readLine();
            }

            // Seleção dos itens necessários para a manutenção e a criação do novo arquivo
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
                for(Products products : list) {
                    if (!products.getCodLicenciado().isEmpty()){
                        bw.write(products.getNf() + ";" + products.getCodLicenciado() + ";" + products.getValRoyalties() + ";" + products.getDtTransac() + ";" + products.getNrTransac() + ";" + products.getCodCondpgto());
                        bw.newLine();
                    }
                }

                System.out.println(targetFileStr + " CREATED");
            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}