package JavaAPIandarrays.arraylist;

 class ConstructorArrayList {
    public ConstructorArrayList(int initialCapacity) {
        super();// // Calls constructor of AbstractList (parent class)
        if (initialCapacity < 0)
            throw new IllegalArgumentException("Illegal Capacity: "+
                    initialCapacity);
        this.elementData = new Object[initialCapacity];
    }
}
