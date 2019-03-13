public class Turma{
   int id, semestreLetivo, anoLetivo;
   Tema tema;
   String sigla;
   
   public Turma(){
   }
   
   public Turma(int id, int semestreLetivo, int anoLetivo, Tema tema, String sigla){
      this.id = id;
      this.semestreLetivo = semestreLetivo;
      this.anoLetivo = anoLetivo;
      this.tema = tema;
      this.sigla = sigla;
   }
   
   public int getId(){
      return id;
   }
   
   public int getSemestreLetivo(){
      return semestreLetivo;
   }
   
   public int getAnoLetivo(){
      return anoLetivo;
   }
   
   public Tema getTema(){
      return tema;
   }
   
   public String getSigla(){
      return sigla;
   }
   
   //Setters
   public void setId(int id){
      this.id = id;
   }
   
   public void setSemestreLetivo(int semestreLetivo){
      this.semestreLetivo = semestreLetivo;
   }
   
   public void setAnoLetivo(int anoLetivo){
      this.anoLetivo = anoLetivo;
   }
   
   public void setTema(Tema tema){
      this.tema = tema;
   }
   
   public void setSigla(String sigla){
      this.sigla = sigla;
   }
   
}