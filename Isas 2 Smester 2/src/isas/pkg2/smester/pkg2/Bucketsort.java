/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isas.pkg2.smester.pkg2;

import java.util.Collections;
import java.util.Vector;

/**
 *
 * @author DAVA
 */
public class Bucketsort {
    static void bucketSort(float arr[], int n)
    {
        if (n <= 0)
            return;
 
       
        Vector<Float>[] buckets = new Vector[n];
 
        for (int i = 0; i < n; i++) {
            buckets[i] = new Vector<Float>();
        }

        for (int i = 0; i < n; i++) {
            float idx = arr[i] / n;
            buckets[(int)idx].add(arr[i]);
        }
 
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }
 
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[index++] = buckets[i].get(j);
            }
        }
    }
}
