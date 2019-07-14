   //1030. 距离顺序排列矩阵单元格
   //解法有待改进
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int [][] dist = new int[R][C];//存储每个点到给定点的距离
        if(R<=0||C<=0) return dist;
        int ans[][] = new int [R*C][2];//返回的结果
        int maxDist = 0;//到给定点的最大距离
        //按照距离进行排序
        for(int i=0;i<R;++i){
            for(int j=0;j<C;++j){
                dist[i][j] = Math.abs(i-r0)+Math.abs(j-c0);
                if(dist[i][j]>maxDist) maxDist = dist[i][j];
            }
        }
        //按照到给定点的距离进行输出
        int h = 0;
        for(int k=0;k<=maxDist;++k){
            for(int i=0;i<R;++i){
                for(int j=0;j<C;++j){
                    //i和j为原始数组的下标
                    if(dist[i][j]==k){
                        ans[h][0] = i;
                        ans[h][1] = j;
                        ++h;
                    }
                }
            }
        }
        return ans;
        
        
    }