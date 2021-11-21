public class ScoringSystem{
   int judge1,judge2,judge3,judge4,judge5;
   
   ScoringSystem(int judge1,int judge2,int judge3,int judge4,int judge5){
       this.judge1 = judge1;
       this.judge2 = judge2;
       this.judge3 = judge3;
       this.judge4 = judge4;
       this.judge5 = judge5;
   }
   
   void score(){
       if((judge1 >= 1 && judge1 <= 5) && (judge2 >= 1 && judge2 <= 5) && (judge3 >= 1 && judge3 <= 5) && (judge4 >= 1 && judge4 <= 5) && (judge5 >= 1 && judge5 <= 5)){
           
       }
   }
}
