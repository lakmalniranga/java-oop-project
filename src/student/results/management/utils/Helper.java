/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.results.management.utils;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Lakmal
 */
public class Helper {
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    
    public static String arrayToCommaSeparatedString(String[] arr) {
        String formatedString = null;
        if (arr.length > 0) {
            StringBuilder nameBuilder = new StringBuilder();
            for (String n : arr) {
                nameBuilder.append(n.replace("'", "\\'")).append(",");
            }
            nameBuilder.deleteCharAt(nameBuilder.length() - 1);
            formatedString = nameBuilder.toString();
        }
        return formatedString;
    }
    
    public static String[] formatArrayToSchemaModal(String[] schema, String[] columns) {
        String[] formatedArray = new String[schema.length];
        
        for (String column : columns) {
            int index = Arrays.asList(schema).indexOf(column);
            formatedArray[index] = "?";
        }
        
        for(int i=0; i<formatedArray.length; i++) {
            if (formatedArray[i] == null) {
                formatedArray[i] = "default";
            }
        }
        return formatedArray;
    }
    
    public static String CommaSeparatedQuizMarks(int numOfMarks) {
        StringBuilder str = new StringBuilder();
        for (int i=0; i<numOfMarks; i++){
            str.append("?,");
        }
        str.setLength(str.length() - 1);
        return str.toString();
    }
}
