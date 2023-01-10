import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreetPeople {
    String simpleStart = "Hello, ";
    String capitalStart = "HELLO, ";
    String result = "";
    List<String> standardNames = new ArrayList<>();
    List<String> capitalNames = new ArrayList<>();
    List<String> joinedNames = new ArrayList<>();

    public String greeter(String[] names) {
        // Check for names split by commas
        for (String s : names) {
            if (s.contains(",")) {
                s.replaceAll(" ", "");
                String[] splitNames = s.split("\\s*,\\s*");
                joinedNames.addAll(Arrays.asList(splitNames));
            } else {
                joinedNames.add(s);
            }
        }

        // In case of 1 input
        if (joinedNames.size() == 1) {
            /*
            Let's check whether the 2nd letter of the name is a capital
            YES: the entire name has to be spelled that way
            NO: the name has to be spelled 'correctly'
            */
            boolean capital = true;
            for (String joinedName : joinedNames) {
                for (int j = 0; j < joinedName.length(); j++) {
                    char actual = joinedName.charAt(j);
                    if (actual > 'Z') {
                        capital = false;
                        break;
                    }
                }
            }

            if (capital) {
                result = capitalStart + joinedNames.get(0) + ".";
            }
            if (!capital) {
                result = simpleStart + joinedNames.get(0) + ".";
            }

            return result;
        }

        // In case of multiple inputs
        if (joinedNames.size() > 1) {
            /*
            Let's check whether the 2nd letter of the name is a capital
            YES: the entire name has to be spelled that way
            NO: the name has to be spelled 'correctly'
            */
            boolean capital = false;
            boolean standard = false;
            for (String joinedName : joinedNames) {
                char actual = joinedName.charAt(1);
                if (actual >= 'A' && actual <= 'Z') {
                    capitalNames.add(joinedName);
                    capital = true;
                } else {
                    standardNames.add(joinedName);
                    standard = true;
                }
            }

            if (capital && !standard) {
                result += capitalStart;
                for (int i = 0; i < joinedNames.size(); i++) {
                    // Until the penultimate run it draws commas, then uses 'AND'
                    if (i < joinedNames.size() - 1) {
                        result += joinedNames.get(i) + ", ";
                    }
                    if (i == joinedNames.size() - 1) {
                        result += "AND " + joinedNames.get(i) + ".";
                    }
                }
            }

            if (!capital) {
                result += simpleStart;
                for (int i = 0; i < joinedNames.size(); i++) {
                    // Until the penultimate run it draws commas, then uses 'and'
                    if (i < joinedNames.size() - 1) {
                        result += joinedNames.get(i) + ", ";
                    }
                    if (i == joinedNames.size() - 1) {
                        result += "and " + joinedNames.get(i) + ".";
                    }
                }
            }

            if (capital && standard) {
                result += simpleStart;
                for (int i = 0; i < standardNames.size(); i++) {
                    // Until the penultimate run it draws commas, then uses 'and'
                    if (i < standardNames.size() - 1) {
                        result += standardNames.get(i) + ", ";
                    }
                    if (i == standardNames.size() - 1) {
                        result += "and " + standardNames.get(i) + ".";
                    }
                }

                result += " AND " + capitalStart;
                for (int i = 0; i < capitalNames.size(); i++) {
                    // Until the penultimate run it draws commas, then uses 'AND'
                    if (i < capitalNames.size() - 1) {
                        result += capitalNames.get(i) + ", ";
                    }
                    if (i == capitalNames.size() - 1) {
                        result += "AND " + capitalNames.get(i) + ".";
                    }
                }
            }
            return result;
        }

        return("Hello, my friend.");
    }
}