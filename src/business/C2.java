package business;


public class C2 extends Carro {


    public C2(String marca, String modelo, int cilindrada, int potenciaMC, float downforce) {
        super(marca, modelo, cilindrada, potenciaMC, downforce,80+(cilindrada/1000)*2);
    }

    public C2(String id, int cilindrada, int fiabilidade, String marca, String modelo, String pneus, int potenciaMC,
              String equipa, int modoMotor, float downforce, int afinacoes, Piloto piloto) {
        super(id, cilindrada, fiabilidade, marca, modelo, pneus, potenciaMC, equipa, modoMotor, downforce, afinacoes, piloto);
    }
}