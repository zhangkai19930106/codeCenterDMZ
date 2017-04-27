package com.bonc;

/**
 * Created by KayZq on 2017/4/26.
 */
public class test {
    private static String seed = "94ECBBD9528526298FCC08BCAA99CA43";
    public static void main(String[] args){
        System.out.println(Arithmetic.getDesString("146C3992D844C94C7A8A9DF85C6F03E1",seed));
        System.out.println(Arithmetic.getDesString("146C3992D844C94C7A8A9DF85C6F03E1",seed).length());
    }
}
