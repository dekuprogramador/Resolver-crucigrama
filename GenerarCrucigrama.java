public class GenerarCrucigrama {
    public char[][] generar(){
        char[][] crucigrama= new char[20][20];
        String entrada="WREDLQWERTYUIOPASDFGZXUVBNMLKJHARBOLQWERTYUIOPASDFGHJKLZXCVBMOUKSQWERTYUIOPHSDFGMNBVCXZLKJHGFDSEQWERQWERTYUIOPASDFGAJKLZXCVBNMLKJHGFDSAPWERTHQWPNODOSTYUIOPSSDFGZXCVBNMLKJHGFDSAQWERRREFOQWERTYUIOPASDFGASDFGHJKLZXCVBNMQWERTYUIOPASDFGHJKLZXCVBNMQWERTYUIOSORTSGHJKLZXCVBNMQWERTYUIOPASDFGHJKLZXCVBNMQWERTYUIOPGSDFGHJKLZXCVBNMLQRKRQWERTYUIOPASDFGZXCVANMLKJHGFDSAQWERTYUIFPASDFGHJKLZXCVBNMQWORTYUIOPASDFGHJK";
        int m=0;
        int N=399;
        for (int i=0; i<20; i++){
            for (int j=0; j<20; j++){
                crucigrama[i][j]=entrada.charAt(m);
                if(m<N){
                    m++;
                }
            }
        }

        return crucigrama;
    }
}