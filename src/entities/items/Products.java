package entities.items;

import java.time.LocalDate;

public class Products {
    private String itens;
    private String codEmpFatura;
    private String nf;
    private String dtEmissao;
    private String dtTransac;
    private String codSerie;
    private String nrTransac;
    private String nrSeqfecha;
    private String codLicenciado;
    private String valRoyalties;
    private String nome;
    private String codCondpgto;


    public Products(String codEmpFatura, String nf, String dtEmissao, String dtTransac, String codSerie, String nrTransac, String nrSeqfecha, String codLicenciado, String valRoyalties, String nome, String codCondpgto) {
        this.codEmpFatura = codEmpFatura;
        this.nf = nf;
        this.dtEmissao = dtEmissao;
        this.dtTransac = dtTransac;
        this.codSerie = codSerie;
        this.nrTransac = nrTransac;
        this.nrSeqfecha = nrSeqfecha;
        this.codLicenciado = codLicenciado;
        this.valRoyalties = valRoyalties;
        this.nome = nome;
        this.codCondpgto = codCondpgto;
    }

    public String getCodEmpFatura() {
        return codEmpFatura;
    }

    public void setCodEmpFatura(String codEmpFatura) {
        this.codEmpFatura = codEmpFatura;
    }

    public String getNf() {
        return nf;
    }

    public void setNf(String nf) {
        this.nf = nf;
    }

    public String getDtEmissao() {
        return dtEmissao;
    }

    public void setDtEmissao(String dtEmissao) {
        this.dtEmissao = dtEmissao;
    }

    public String getDtTransac() {
        return dtTransac;
    }

    public void setDtTransac(String dtTransac) {
        this.dtTransac = dtTransac;
    }

    public String getCodSerie() {
        return codSerie;
    }

    public void setCodSerie(String codSerie) {
        this.codSerie = codSerie;
    }

    public String getNrTransac() {
        return nrTransac;
    }

    public void setNrTransac(String nrTransac) {
        this.nrTransac = nrTransac;
    }

    public String getNrSeqfecha() {
        return nrSeqfecha;
    }

    public void setNrSeqfecha(String nrSeqfecha) {
        this.nrSeqfecha = nrSeqfecha;
    }

    public String getCodLicenciado() {
        return codLicenciado;
    }

    public void setCodLicenciado(String codLicenciado) {
        this.codLicenciado = codLicenciado;
    }

    public String getValRoyalties() {
        return valRoyalties;
    }

    public void setValRoyalties(String valRoyalties) {
        this.valRoyalties = valRoyalties;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodCondpgto() {
        return codCondpgto;
    }

    public void setCodCondpgto(String codCondpgto) {
        this.codCondpgto = codCondpgto;
    }

    public String getItens() {
        return itens;
    }

    public void setItens(String itens) {
        this.itens = itens;
    }
}
