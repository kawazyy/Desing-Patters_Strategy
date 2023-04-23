public class Geometrica implements ICalcMedia {
    
    
    private double resultado; //variavel feita para usar o metodo situação como void
    
    
    @Override
    public double CalculaMedia(double a, double b) {
       resultado = Math.sqrt(a*b)/2;
        return resultado;
     
    }

    @Override
    public String Situacao() {
    
        if (resultado>7){
            return "aprovado";
        }
        else{
            return "reprovado";
        }
    }
    
}
