/**
 * Copyright (c) 2021 Absolute Software Corporation. All rights reserved. Reproduction or
 * transmission in whole or in part, in any form or by any means, electronic, mechanical or
 * otherwise, is prohibited without the prior written consent of the copyright owner.
 */
package String;

public class String_Axon_AlgoTest1 {
    public static String solution(String angles) {
        int open = 0;
        int flag = 0;
        int close = 0;
        for (int i=0; i< angles.length(); i++){
            if (angles.charAt(i)== '<'){
                open++;
            } else {
                if (open > 0 ){
                    open--;
                } else {
                    close++;
                }
            }
        }
        StringBuffer openResult = new StringBuffer();
        StringBuffer closeResult = new StringBuffer();
        StringBuffer result = new StringBuffer();
        for (int i=0; i< close; i++){
            openResult.append("<");
        }
        for (int i=0; i< open; i++){
            closeResult.append(">");
        }
        result.append(openResult);
        result.append(angles);
        result.append(closeResult);
        return result.toString();
    }
    public static void main(String[] args) {
        String s = "><<><";
        System.out.println(solution(s));
    }
}
