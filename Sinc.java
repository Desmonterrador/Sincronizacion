class Sinc extends Thread{
    StringBuffer letras;
    public Sinc(StringBuffer letras){
        this.letras = letras;
    }
    public void run(){
        synchronized(letras){
            for(int i = 1; i <=100; i++){
                System.out.printf("%d ", i);
                System.out.printf(letras);
            }
            char temp = letras.charAt(0);
            ++temp;
            letras.setCharAt(0, temp);
        }
    }
    public static void main(String [] args){
        StringBuffer sb  = new StringBuffer("A");
        new Sinc(sb).start();
        new Sinc(sb).start();
        new Sinc(sb).start();
        new Sinc(sb).start();
    }
}
