package br.com.fiap.cp1.model;

public class Veiculo {
    public String marca;
    public String modelo;
    public String placa;
    public int anoFabricacao;
    public int numLugares;
    public double autonomia;
    public double motor;
    public double valorDiaria;
    public boolean arCondicionado;
    public String combustivel;
    public boolean manual;
    public boolean alugado;

    public Veiculo(String marca, String modelo, String placa, int anoFabricacao, int numLugares, double autonomia, double motor, double valorDiaria, boolean arCondicionado, String combustivel, boolean manual, boolean alugado) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
        this.numLugares = numLugares;
        this.autonomia = autonomia;
        this.motor = motor;
        this.valorDiaria = valorDiaria;
        this.arCondicionado = arCondicionado;
        this.combustivel = combustivel;
        this.manual = manual;
        this.alugado = alugado;
    }

    public Veiculo() {

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getNumLugares() {
        return numLugares;
    }

    public void setNumLugares(int numLugares) {
        this.numLugares = numLugares;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public boolean isManual() {
        return manual;
    }

    public void setManual(boolean manual) {
        this.manual = manual;
    }

    public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }
}

