public class LabelFor {
    public static void main(Sring[] args) {
        int i = 0;
outer:
        for(; true;) {
innnr:
            for(; i<10; i++) {
                System.out.println("i="+i);
                if(i==2) {
                    System.out.println("continue");
                    continue;
                }
            }
        }
    }
}
