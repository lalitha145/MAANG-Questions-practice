/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        HashMap<Integer, Employee> hashMap = new HashMap<>();
        for (Employee employee : employees){
            System.out.println(employee.id+"  "+employee.importance+"  "+employee.subordinates);
            hashMap.put(employee.id, employee);
        }
        Queue<Employee> q = new LinkedList<>();
        q.add(hashMap.get(id));
        int sum = 0;
        while (!q.isEmpty()) {
            Employee emp = q.poll();
            sum += emp.importance;
            for (int i : emp.subordinates) q.add(hashMap.get(i));
        }
        return sum;
    }
}