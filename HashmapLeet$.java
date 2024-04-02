import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length())
            return false;

        Map<Character, Character> charMappingMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {

            char org = s.charAt(i);
            char rep = t.charAt(i);

            if (!charMappingMap.containsKey(org)) {
                if (!charMappingMap.containsValue(rep))
                    charMappingMap.put(org, rep);
                else
                    return false;
            } else {
                char mappedCharcter = charMappingMap.get(org);

                if (mappedCharcter != rep)
                    return false;
            }

        }
        return true;

    }

}
