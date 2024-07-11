package dev.thanawat.proxycapture.Vote;

import java.time.LocalDate;

import org.omg.CORBA.PUBLIC_MEMBER;

public class VoteMapper {
	public static AGMS_VOTE toVote(VoteDTO dto) {
		return new AGMS_VOTE(dto.getTransactionID(),dto.getYear(),dto.getTerm(),dto.getResult() ,"JoshA", LocalDate.now(), "Josh", LocalDate.now());
	}
	public static VoteDTO responeVoteDTO(AGMS_VOTE vote) {
		return new VoteDTO(vote.getTransactionID(), vote.getYear(), null, null, null)
	}
}
