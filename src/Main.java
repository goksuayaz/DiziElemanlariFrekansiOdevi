public class Main {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
        int [] fr = new int [dizi.length];


        int visited = -1;
        for(int i = 0; i < dizi.length; i++){
            int count = 1;
            for(int j = i+1; j < dizi.length; j++){
                if(dizi[i] == dizi[j]){
                    count++;
                    fr[j] = visited;
                }
            }
            if(fr[i] != visited)
                fr[i] = count;
        }

        System.out.println("    Element | Frequency");
        System.out.println("    ------------------           ");
        for(int i = 0; i < fr.length; i++){
            if(fr[i] != visited)
                System.out.println("       " +  dizi[i]  + "   |   " + fr[i]);
        }
    }
}
