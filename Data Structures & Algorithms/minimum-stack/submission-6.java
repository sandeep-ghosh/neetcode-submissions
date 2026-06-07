class MinStack {
    private List<Integer> arr, min_arr;
    public MinStack() {
        this.arr = new ArrayList<>();
        this.min_arr = new ArrayList<>();
    }

    public void push(int val) {
        arr.add(val);
        if (min_arr.isEmpty()) {
            min_arr.add(val);
        } else {
            min_arr.add(Math.min(val, min_arr.get(min_arr.size() - 1)));
        }
    }

    public void pop() {
        arr.remove(arr.size() - 1);
        min_arr.remove(min_arr.size() - 1);
    }

    public int top() {
        return arr.get(arr.size() - 1);
    }

    public int getMin() {
        return min_arr.get(min_arr.size() - 1);
    }
}
