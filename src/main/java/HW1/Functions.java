package HW1;

import java.nio.charset.Charset;
import java.util.List;
import java.util.*;
import java.lang.Math;


public class Functions {

    public static void main(String[] args){
        Functions f = new Functions();
        System.out.println(f.randomStr());
    }

    public int listAdd(List<Integer> toAdd) {
        int retVal = 0;
        for(Integer n : toAdd) {
            retVal += n;
        }
        return retVal;
    }

    public String randomStr() {
        byte[] array = new byte[12]; // length is bounded by 12
        new Random().nextBytes(array);
        String randStr = new String(array);
        System.out.println(randStr);

        return randStr;
    }

    public boolean testStrEq(String str){
        return str == "hello";
    }
}
