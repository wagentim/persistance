package cn.wagentm.managers.work;

import cn.wagentim.entities.work.TicketComment;
import cn.wagentim.managers.ObjectDBManager;
import de.wagentim.qlogger.channel.DefaultChannel;
import de.wagentim.qlogger.channel.LogChannel;
import de.wagentim.qlogger.logger.Log;
import de.wagentim.qlogger.service.QLoggerService;

public class WorkObjectDBManager extends ObjectDBManager
{
	private LogChannel logger = QLoggerService
			.getChannel(QLoggerService.addChannel(new DefaultChannel(WorkObjectDBManager.class.getSimpleName())));
	
	/* save one comment to the comment table */
	public void saveTicketComment(final int number, TicketComment comment)
	{
		if( number <= 0 || null == comment )
		{
			logger.log(Log.LEVEL_ERROR, "ticket number or comment is wrong");
			return;
		}
		
		addOrUpdateEntityOnlyPositiveNumber(comment);
	}
}
