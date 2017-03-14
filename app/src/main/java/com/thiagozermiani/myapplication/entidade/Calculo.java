package com.thiagozermiani.myapplication.entidade;

/**
 * Created by thiago zermiani on 08/03/2017.
 */
public class Calculo {
    private long id;
    private double valorUm;
    private double valorDois;
    private String operador;
    private double resultado;


    public Calculo(long id, double valorUm, double valorDois, String operador, double resultado) {
        this.id = id;
        this.valorUm = valorUm;
        this.valorDois = valorDois;
        this.operador = operador;
        this.resultado = resultado;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getValorUm() {
        return valorUm;
    }

    public void setValorUm(double valorUm) {
        this.valorUm = valorUm;
    }

    public double getValorDois() {
        return valorDois;
    }

    public void setValorDois(double valorDois) {
        this.valorDois = valorDois;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public Calculo() {

    }

    @Override
    public String toString() {
        return "Calculo{" +
                "id=" + id +
                ", valorUm=" + valorUm +
                ", valorDois=" + valorDois +
                ", operador='" + operador + '\'' +
                ", resultado=" + resultado +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Calculo calculo = (Calculo) o;

        if (id != calculo.id) return false;
        if (Double.compare(calculo.valorUm, valorUm) != 0) return false;
        if (Double.compare(calculo.valorDois, valorDois) != 0) return false;
        if (Double.compare(calculo.resultado, resultado) != 0) return false;
        return operador != null ? operador.equals(calculo.operador) : calculo.operador == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (id ^ (id >>> 32));
        temp = Double.doubleToLongBits(valorUm);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(valorDois);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (operador != null ? operador.hashCode() : 0);
        temp = Double.doubleToLongBits(resultado);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
