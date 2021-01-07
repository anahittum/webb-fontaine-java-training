package todolist;

class AllEngineers {

    private static Engineer[] engineers = new Engineer[6];

    static {
        engineers[0] = new Engineer("A", Role.QA);
        engineers[1] = new Engineer("B", Role.QA);
        engineers[2] = new Engineer("C", Role.DEVELOPER);
        engineers[3] = new Engineer("D", Role.DEVELOPER);
        engineers[4] = new Engineer("E", Role.PM);
    }

    private AllEngineers() {
    }

    static Engineer[] get() {
        return engineers;
    }

}
