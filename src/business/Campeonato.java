package business;

import java.util.*;



public class Campeonato implements ICampeonato {
    private String nome;
    private int corridaAtual;
    private String categoria;
    Map<String, Equipa> equipas;
    List<Corrida> corridas;

    public Campeonato(String nome, String categoria, Map<String, Equipa> equipas, List<Corrida> corridas) {
        this.nome = nome;
        this.categoria = categoria;
        this.corridaAtual = 0;
        this.equipas = equipas;
        this.corridas = corridas;
    }

    @Override
    public Map<String, Equipa> getEquipas() {
        return this.equipas;
    }

    @Override
    public List<Corrida> getCorridas() {
        return this.corridas;
    }

    @Override
    public int getCorridaAtual() {
        return this.corridaAtual;
    }

    // ns oq fazer com isto
    @Override
    public List<Equipa> getClassificacao() {;

        ArrayList<Equipa> liste = new ArrayList<Equipa>(equipas.values());
        sortTeams((liste));
        return liste;
    }

    public void sortTeams(List<Equipa> teams) {
        // Cria um comparador personalizado que ordena as equipes em ordem decrescente pelo número de pontos
        Comparator<Equipa> comparator = new Comparator<Equipa>() {
            @Override
            public int compare(Equipa t1, Equipa t2) {
                return t2.getpontuacao() - t1.getpontuacao();
            }
        };

        // Ordena a lista usando o comparador personalizado
        Collections.sort(teams, comparator);
    }

   // @Override

    public int getNCorridas() {
        return corridas.size();
    }

    @Override
    public int getCorridasRestantes() {
        return (getNCorridas() - corridaAtual);
    }

    @Override
    public void calculaClassificacao(List<Carro> classificacaoCorrida) {
        int j = 18;
        for (int i = 1; i < classificacaoCorrida.size(); i++) {
            for (Carro c : classificacaoCorrida) {
                String s = c.getEquipa();
                Equipa e = equipas.get(s);
                if (i == 1) e.addpontuacao(25);
                if (i == 2) e.addpontuacao(18);
                if (i == 3) e.addpontuacao(15);
                if (i >= 4 && i < 10) e.addpontuacao(j);
                else e.addpontuacao(1);

                j-=2;

            }
        }

    }


    // idUSER??
    @Override
    public void adicionaEquipa(String idUser, String nome, Carro c, Piloto p1, Piloto p2, int ncorridas) {
        Equipa equipaNova = new Equipa(idUser, nome, c, p1, p2);
        equipas.put(nome, equipaNova);

    }


    // Parte do utilizador escolher
    @Override
    public List<Equipa> simulaCampeonato(String idCampeonato) {

        float downforce=1; //utilizador escolhe
        for (Corrida c: corridas){
            for(Equipa e : getClassificacao()){
                Carro c1 = e.getCarro();
                Carro c2 = e.getCarro();
                if (c1.verificarAfinação()) c1.setAfinação(downforce);
                if (c2.verificarAfinação()) c2.setAfinação(downforce);

                //mudar pneus

                //falta muita cena, n faz sentido o que temos


            }
        }
        return (List<Equipa>) equipas;
    }


}