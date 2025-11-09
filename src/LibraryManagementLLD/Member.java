package LibraryManagementLLD;

public class Member {

    private long memberId;
    private String memberName;

    public Member(long memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public long getMemberId() {
        return memberId;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
}
