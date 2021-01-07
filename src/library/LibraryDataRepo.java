package library;


class LibraryDataRepo {
    static String [] names = {"name1", "name2", "name3", "name4", "name5", "name6", "name7"};
    static String [] surnames = {"surname1", "surname2", "surname3", "surname4", "surname5", "surname6", "surname7"};
    static String [] titles = {"title1", "title2", "title3", "title4", "title5", "title6", "title7"};
    static String [] categories = {"category1", "category2", "category3", "category4", "category5", "category6", "category7"};

    static void ArrayToString(Object[] array) {
        if (array != null)
            for (Object object : array) {
                System.out.println(object);
            }
    }
}
