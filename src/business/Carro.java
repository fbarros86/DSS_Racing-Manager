package business;
import java.util.Objects;
import java.util.UUID;


public class  Carro implements ICarro {

    final int AGRESIVO = -1;
    final int NORMAL = 0;
    final int CONSERVADOR = 1;

    //@TODO TA TUDO MALLLLLLLLLLLLL
    private String id;
    private String pneus;
    private String marca;
    private String modelo;
    private String categoria;
    private String equipa;
    private int cilindrada;
    private int fiabilidade;
    private int potenciaMC;
    private int modoMotor;
    private int nAfinacoes;
    private float downforce;
    private Piloto piloto;



    public Carro(Carro copy){
        this.id = UUID.randomUUID().toString();
        this.marca = copy.marca;
        this.modelo = copy.modelo;
        this.potenciaMC = copy.potenciaMC;
        this.downforce = copy.downforce;
        this.cilindrada = copy.cilindrada;
    }


    public Carro(String marca, String modelo, int cilindrada, int potenciaMC, float downforce, int fiabilidade,String categoria){

            this.id = UUID.randomUUID().toString();
            this.marca = marca;
            this.modelo = modelo;
            this.potenciaMC = potenciaMC;
            this.downforce = downforce;
            this.cilindrada = cilindrada;
            this.categoria = categoria;
            this.fiabilidade = fiabilidade;
        }

    public Carro(String id, int cilindrada, int fiabilidade, String marca, String modelo , int potenciaMC,
              float downforce,String categoria){
        this.id = id;
        this.cilindrada = cilindrada;
        this.fiabilidade = fiabilidade;
        this.marca = marca;
        this.modelo = modelo;
        this.potenciaMC = potenciaMC;
        this.downforce = downforce;
        this.categoria = categoria;
    }


    public Carro(String id, int cilindrada, int fiabilidade, String marca, String modelo, String penus,int potenciaMC,
        String equipa, int modoMotor, float downforce, int afinacoes, Piloto piloto){
            this.id = id;
            this.cilindrada = cilindrada;
            this.fiabilidade = fiabilidade;
            this.marca = marca;
            this.modelo = modelo;
            this.pneus = penus;
            this.potenciaMC = potenciaMC;
            this.equipa = equipa;
            this.modoMotor = modoMotor;
            this.downforce = downforce;
            this.nAfinacoes = afinacoes;
            this.piloto = piloto;
        }

        public String getId () {
            return id;
        }

        @Override
        public void setPneus (String aPneu){
            pneus = aPneu;
        }

        @Override
        public String getPneus () {
            return pneus;
        }

        @Override
        public void setDownforce ( float d){
            downforce = d;
        }

        @Override
        public float getDownforce () {
            return downforce;
        }

        @Override
        public void setCilindrada ( int c){
            cilindrada = c;
        }

        @Override
        public int getCilindrada () {
            return cilindrada;
        }

        @Override
        public void setPiloto (Piloto aP){

            piloto = aP;
            if (this instanceof SC) setFiabilidade((int) (75*(1- aP.getSva()) + cilindrada/100));

        }

    public String getTipo() {
        return categoria;
    }

    @Override
        public void setNAfinacoes ( int aN){
            nAfinacoes = aN;
        }


        @Override
        public void setModoMotor ( int aModo){
            modoMotor = aModo;
        }

        @Override
        public int gettModoMotor () {
            return modoMotor;
        }


        @Override
        public String getEquipa () {
            return equipa;
        }

        @Override
        public void setEquipa (String e){
            equipa = e;
        }

        @Override
        public int getPotencia () {
            return potenciaMC;
        }

        @Override
        public Piloto getPiloto () {
            return piloto;
        }

        @Override
        public int getFiabilidade () {
            return fiabilidade;
        }

        @Override
        public String getID () {
            return id;
        }

        @Override
        public boolean verificarAfinacao () {
            if (this instanceof C1 || this instanceof C2) return nAfinacoes > 0;
            else return false;
        }

        @Override
        public int hashCode () {
            return Objects.hash(cilindrada, marca, modelo, potenciaMC);
        }

        @Override
        public void setAfinacao ( float aDownforce){
            nAfinacoes--;
            this.downforce = aDownforce;
        }

        public void setFiabilidade ( int fiabilidade){
            this.fiabilidade = fiabilidade;
        }

        public String getMarca () {
            return marca;
        }

        public void setMarca (String marca){
            this.marca = marca;
        }

        public String getModelo () {
            return modelo;
        }

        public void setModelo (String modelo){
            this.modelo = modelo;
        }

        public int getPotenciaMC () {
            return potenciaMC;
        }

        public void setPotenciaMC ( int potenciaMC){
            this.potenciaMC = potenciaMC;
        }

        public int getModoMotor () {
            return modoMotor;
        }

        public void setId (String id){
            this.id = id;
        }

        public int getnAfinacoes () {
            return nAfinacoes;
        }

        public void setnAfinacoes ( int nAfinacoes){
            this.nAfinacoes = nAfinacoes;
        }

        public String toOptionalString(){
            StringBuilder sb = new StringBuilder();
            sb.append("Carro (").append(id).append("): \n")
                    .append("Marca: ").append(marca).append("\nModelo: ").append(modelo).append("\nCilindrada: ")
                    .append("Potencia motor classico: ").append(potenciaMC).append("\n");
            return sb.toString();
        }

        public String standing(){
            StringBuilder sb = new StringBuilder();
            sb.append(piloto.getNome()).append("(").append(equipa).append(")\n");
            return sb.toString();
        }

        @Override
        public String toString () {
            return "Carro{" +
                    ", modoMotor=" + modoMotor +
                    ", cilindrada=" + cilindrada +
                    ", pneus='" + pneus + '\'' +
                    ", fiabilidade=" + fiabilidade +
                    ", marca='" + marca + '\'' +
                    ", modelo='" + modelo + '\'' +
                    ", potenciaMC=" + potenciaMC +
                    ", equipa='" + equipa + '\'' +
                    ", modoMotor=" + modoMotor +
                    ", id='" + id + '\'' +
                    ", downforce=" + downforce +
                    ", piloto=" + piloto +
                    ", nAfinacoes=" + nAfinacoes +
                    '}';
        }
}
