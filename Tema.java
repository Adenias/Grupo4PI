public class Tema {
   int id;
   String dtCadastro, titulo, introducao, requisitos;
   
   public Tema(){
   }
   
   public Tema(int id, String dtCadastro, String titulo, String introducao, String requisitos){
      this.id = id;
      this.dtCadastro = dtCadastro;
      this.titulo = titulo;
      this.introducao = introducao;
      this.requisitos = requisitos;
   }
   
   public int getId(){
      return id;
   }
   
   public String getDtCadastro(){
      return dtCadastro;
   }
   
   public String getTitulo(){
      return titulo;
   }
   
   public String getIntroducao(){
      return introducao;
   }
   
   public String getRequisitos(){
      return requisitos;
   }
   
   //Setters
   public void setId(int id){
      this.id = id;
   }
   
   public void setDtCadastro(String dtCadastro){
      this.dtCadastro = dtCadastro;
   }
   
   public void setTitulo(String titulo){
      this.titulo = titulo;
   }
   
   public void setIntroducao(String introducao){
      this.introducao = introducao;
   }
   
   public void setRequisitos(String requisitos){
      this.requisitos = requisitos;
   }
}