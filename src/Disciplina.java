public class Disciplina {

    private ICalcMedia calcMedia;
    public String nome;
    public double media;
    private double p1;
    private double p2;
    public String situacao;
   
   
    //SET
    public void setCalcMedia(ICalcMedia calcMedia) {
        this.calcMedia = calcMedia;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setP1(double p1) {
        this.p1 = p1;
    }
    public void setP2(double p2) {
        this.p2 = p2;
    }
    
    
    //GET
    public String getNome() {
        return nome;
    }
    public double getP1() {
        return p1;
    }
    public double getP2() {
        return p2;
    }
    public String getSituacao() {
        return this.calcMedia.Situacao();
    }


    public double CalculaMedia(){
        return this.calcMedia.CalculaMedia(this.p1, this.p2);
    }

    
}
