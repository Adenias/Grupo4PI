public class Entrega{
   int id;
   String dtCadastro;
   Grupo grupoId;
   Atividade atividadeId;
   
   public Entrega(){
   }
   
   public Entrega(int id, String dtCadastro, Grupo grupoId, Atividade atividadeId){
      this.id = id;
      this.dtCadastro = dtCadastro;
      this.grupoId = grupoId;
      this.atividadeId = atividadeId;
   }
   
   public int getId(){
      return id;
   }
   
   public String getDtCadastro(){
      return dtCadastro;
   }
   
   public Grupo getGrupoId(){
      return grupoId;
   }
   
   public Atividade getAtividadeId(){
      return atividadeId;
   }
   
   //Setters
   public void setId(int id){
      this.id = id;
   }
   
   public void setDtCadastro(String dtCadastro){
      this.dtCadastro = dtCadastro;
   }
   
   public void setGrupoId(Grupo grupoId){
      this.grupoId = grupoId;
   }
   
   public void setAtividadeId(Atividade atividadeId){
      this.atividadeId = atividadeId;
   }
}