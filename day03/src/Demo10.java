/**
 * 在嵌套循环的场景下，默认情况下面，break continue关键字作用的是内层循环，但是如果我们想作用于外层循环呢？
 *   此时我们需要给内外层循环打标记，在break或者continue关键字后面跟上对应的标记即可
 */
public class Demo10 {
    static void main(String[] args) {
        /*outer:for(int i = 1;i<4;++i){
            inner:for(int j = 1;j<4;++j){
                if(i == j){
                    break outer;// 终止外层循环
                }
                System.out.println(i + "  " + j);
            }
        }*/

        /*outer:for(int i = 1;i<10;i++){
             if(i == 7){
                 System.out.println("test");
                 break outer;
             }
        }
        System.out.println("循环执行结束");*/

        outer:for(int i = 1;i<4;++i){
            inner:for(int j = 1;j<4;++j){
                if(i == j){
                    continue outer;// 终止外层循环
                }
                System.out.println(i + "  " + j);
            }
        }
    }
}
