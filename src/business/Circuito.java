package business;

import java.util.List;
import java.util.Objects;



public class Circuito {

    private String  nome;
    private float dist;
    private int nrVoltas;
    private List<Segmento> percurso;

    public Circuito(String  nome, float dist, int nrVoltas, List<Segmento> percurso){
        this.nome = nome;
        this.dist = dist;
        this.nrVoltas = nrVoltas;
        this.percurso = percurso;
    }

    public String getNome() {
        return nome;
    }

    public void setPercurso(List<Segmento> percurso) {
        this.percurso = percurso;
    }

    public List<Segmento> getPercurso() {
        return this.percurso;
    }

    public void setDist(float dist) {
        this.dist = dist;
    }

    public void setNrVoltas(int nrVoltas) {
        this.nrVoltas = nrVoltas;
    }

    // GDU STRING???
    public void atribuirGDU(int key, int GDU){
        Segmento s = percurso.get(key);
        s.setGDU(GDU);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getDist() {
        return dist;
    }

    public int getNrVoltas() {
        return nrVoltas;
    }

    @Override
    public String toString() {
        return "Circuito{" +
                "nome='" + nome + '\'' +
                ", dist=" + dist +
                ", nrVoltas=" + nrVoltas +
                ", percurso=" + percurso +
                '}';
    }
}