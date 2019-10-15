package com.company;

import java.util.ArrayList;
import java.util.Stack;

public class Roteador extends DispositivoDeRede implements Roteamento{

    private ArrayList<Porta> portas;
    private Stack<Pacote> buffers;

    @Override
    public String getEnderecoIP() {
        return null;
    }

    @Override
    public void setEnderecoIP(String enderecoIP) {

    }

    @Override
    public String getEnderecoMac() {
        return null;
    }

    @Override
    public void setEnderecoMac(String enderecoMac) {

    }

    @Override
    public String roteamento(Pacote pacote) {
        return null;
    }
}
