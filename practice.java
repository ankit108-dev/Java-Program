public class practice {
    
    public static void main(String[] args) {
       
        int [] a={5,4,1,2,3};
         int  k=3;
         int l=k;
        
        for(int i =0;i<2;i++){
                
                if (i==0){
                    for(int j=a.length-k;j<a.length;j++){
                         System.out.print(a[j]);
                         k--;
                    }
                
                }else{
                    int m=0;
                    while(m<a.length-l){
                        System.out.print(a[m]);
                        m++;
                    }
                }
        }
        
    }
}
