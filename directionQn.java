/*Given a route containing 4 direction (E,W,N,S) 
find the shortest path to reach destination */

import java.util.*;
public class directionQn {
    public static float getShortestPath(String path){
        int x=0, y = 0;
        for(int i =0; i<path.length(); i++){
            char dir = path.charAt(i);

            //South
            if (dir == 'S' || dir == 's'){
                y--;
            }

            // North
            else if(dir == 'N' || dir == 'n'){
                y++;
            }

            //East 
            else if(dir == 'E' || dir == 'e'){
                x++;
            }

            //West
            else if (dir == 'W' || dir == 'w'){
                x--;
            }

        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Direction : in (EWNS) : ");

        String path = sc.next();
        System.out.println(getShortestPath(path));
    }
    
}
