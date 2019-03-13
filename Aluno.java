public class Aluno extends Usuario{
   String ra;
   
   public Aluno(){
      
   }
   
   public Aluno(int id, String nome, String email, String senha, String ra){
      super(id, nome, email, senha);
      this.ra = ra;
   }
   
   public String getRa(){
      return ra;
   }
   
   //Setters
   public void setRa(String ra){
      this.ra = ra;
   }
}