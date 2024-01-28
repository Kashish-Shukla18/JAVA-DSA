package Recursion;

public class RemoveDeplicates {
    public static void removeDuplicate(String str,int i,StringBuilder newStr ,boolean map[]) {
        if (i == str.length()-1) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(i);
        if (map[currChar- 'a'] == true) {
//            duplicate
            removeDuplicate(str, i + 1, newStr, map);
        } else {
            map[currChar-'a'] = true;
            removeDuplicate(str, i + 1, newStr.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        String str="appnnacollege";
        removeDuplicate(str,0,new StringBuilder(""),new boolean[26]);
    }
    }

