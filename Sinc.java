class Sinc extends Thread{
    Stringbuffer letras;
    public Sinc(Stringbuffer letras){
        this.letras = letras;
    }
    public void run(){
        Synchronized(letras){
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
        Stringbuffer sb  = new Stringbuffer("A");
        new Sinc(sb).start();
        new Sinc(sb).start();
        new Sinc(sb).start();
        new Sinc(sb).start();
    }
}