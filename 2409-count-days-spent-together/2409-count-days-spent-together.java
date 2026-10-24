class Solution {
    public int totalDays(String str,int[] days){
        int month=Integer.parseInt(str.substring(0,2));
        int day=Integer.parseInt(str.substring(3,5));
        for(int i=0;i<month-1;i++){
            day+=days[i];
        }
        return day;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
        int a1=totalDays(arriveAlice,days);
        int a2=totalDays(leaveAlice,days);
        int b1=totalDays(arriveBob,days);
        int b2=totalDays(leaveBob,days);

        int ab1=Math.max(a1,b1);
        int ab2=Math.min(a2,b2);
        return Math.max(ab2-ab1+1,0);
    }
}