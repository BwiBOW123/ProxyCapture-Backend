package dev.thanawat.proxycapture.Holder;

public class HolderMapper {
	public static HolderDTO responeHolderDTO(AGMS_HOLDER holder) {
		return new HolderDTO(holder.getShare_NO(),holder.getShare_Name());
	}
}
