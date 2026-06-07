class MinStack {
    List<Integer> arr, min_arr;
    public MinStack() {
        arr = new ArrayList<>();
        min_arr = new ArrayList<>();
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
        if (!arr.isEmpty()) {
            arr.remove(arr.size() - 1);
            min_arr.remove(min_arr.size() - 1);
        }
    }

    public int top() {
        if (!arr.isEmpty()) {
            int ret = arr.get(arr.size() - 1);
            return ret;
        }
        return -1;
    }

    public int getMin() {
        if (!min_arr.isEmpty()) {
            return min_arr.get(min_arr.size() - 1);
        }
        return -1;
    }
}
