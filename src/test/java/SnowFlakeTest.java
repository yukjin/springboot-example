/**
 * Created by luzhen on 17/4/23.
 */
public class SnowFlakeTest {
    public static void main(String[] args) {
    SnowflakeIdWorker idWorker = new SnowflakeIdWorker(1,1);
        long start = System.currentTimeMillis();
        int count = 0;
        for(int i=0;i<10000000;i++){
            if(i%10000==0){
                System.out.println(System.currentTimeMillis());
            }
            idWorker.nextId();
        }
    }
}
