package sunset.it.tools.api.interfaces.auth;

import sunset.it.tools.api.objects.RemoteUnlockContext;

public interface Unlock {

	public String remoteUnlock(RemoteUnlockContext context);
	
}
