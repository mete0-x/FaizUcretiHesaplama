/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class faiz {
    public static void main(String[] args) {
        int anapara= 10000;
        int toplam = 0;
        int onuncuyıl = 0;

        for (int yıl= 1; yıl <=14; yıl++) {
          anapara +=(anapara*0.05);

             if (yıl > 10) {
                toplam = anapara;
            }
             if (yıl == 10) {
                onuncuyıl = anapara;
            }
            
        }
        System.out.println("On yıl sonunda   : "+onuncuyıl);
        System.out.println("on yılı grçtikten sonraki 4 yıl  :"+toplam);
    }
}
