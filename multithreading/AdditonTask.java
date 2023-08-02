package multithreading;

public class AdditonTask {
    int start;
    int end;
    static long sum=0;

    public AdditonTask() {
    }

    public AdditonTask(int start, int end) {
        this.start = start;
        this.end = end;
    }
    synchronized void add(){
        for (int index = start; index <end ; index++) {
            sum +=index;
        }
    }

    public static void main(String[] args) {
        AdditonTask additonTask = new AdditonTask();
        additonTask.add();
        System.out.println("sum "+sum);
    }
}
