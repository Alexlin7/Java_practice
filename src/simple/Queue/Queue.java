package simple.Queue;

/* 程式範例: Queue.java */ 
public class Queue {    // 佇列類別
   public Node front;   // 佇列的前端
   public Node rear;    // 佇列的尾端
   // 建構子
   public Queue() {
      front = null;     // 初始佇列指標
      rear = null;
   }
   // 方法: 存入佇列資料
   public void enqueue(int d) {
      Node new_node = new Node(d); // 建立節點
      // 檢查佇列是否是空的
      if ( isQueueEmpty() )
         front = new_node;         // 插入成為第1個節點
      else rear.next = new_node;   // 新增在結尾
      rear = new_node;             // 更新尾端指標
   }
   // 方法: 取出佇列資料
   public int dequeue() {
      int d;
      // 檢查佇列是否是空的
      if ( !isQueueEmpty() ) {  // 不是空的
         if ( front == rear )     // 最後節點的特殊情況
            rear = null;          // 更新尾端指標
         d = front.data;          // 取得佇列資料
         front = front.next;      // 刪除第1個節點
         return d;                // 傳回節點資料
      }
      else return -1;             // 佇列是空的
   }
   // 方法: 檢查佇列是否是空的
   public boolean isQueueEmpty() {
       return front == null;
   }
}
