package org.example.responsibility;

/**
 * @author CJW
 * @since 2024/7/18
 */
public class Level3Approver extends Approver{
    public Level3Approver(String name) {
        super(name);
    }

    @Override
    public void processApprover(ApproveRequest approveRequest) {
        if(approveRequest.getPrice() >10000) {
            System.out.println(" 请求编号 id= " + approveRequest.getId() + " 被 " + this.name + " 处理");
        }else {
            next.processApprover(approveRequest);
        }
    }
}
