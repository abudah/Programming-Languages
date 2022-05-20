package FileAndProgram_ProgrammingLang;

import java.util.Comparator;

public class NameComparator implements Comparator<ProgrammingLanguage_1> {

    // override the compare() method
    public int compare(ProgrammingLanguage_1 p1, ProgrammingLanguage_1 p2)
    {
        return p1.name.compareTo(p2.name);
    }
}