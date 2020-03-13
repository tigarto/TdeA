class DiaAnyo {
    private int mes;
    private int dia;
    public DiaAnyo(int d, int m) {
        dia = d;
        mes = m;
    }

    public boolean igual(DiaAnyo d) {
        if ((dia == d.dia) && (mes == d.mes))
            return true;
        else
            return false;
    }

    public void visualizar() {
        System.out.println("mes = " + mes + " , dia = " + dia);
    }
}
