public class Avaliacao{
   int id;
   double nota;
   String dtAvaliacao, comentarios;
   //Entrega entregaId;
   //Turma_Aluno turmaAlunoId;
   
   public Avaliacao(){
   }
   
   public Avaliacao(int id, double nota, String dtAvaliacao, String comentarios){
      this.id = id;
      this.nota = nota;
      this.dtAvaliacao = dtAvaliacao;
      this.comentarios = comentarios;
   }
   
   public int getId(){
      return id;
   }
   
   public double getNota(){
      return nota;
   }
   
   public String getDtAvaliacao(){
      return dtAvaliacao;
   }
   
   public String getComentarios(){
      return comentarios;
   }
   
   //Setters
   public void setId(int id){
      this.id = id;
   }
   
   public void setNota(double nota){
      this.nota = nota;
   }
   
   public void setDtAvaliacao(String dtAvaliacao){
      this.dtAvaliacao = dtAvaliacao;
   }
   
   public void setComentarios(String comentarios){
      this.comentarios = comentarios;
   }
}