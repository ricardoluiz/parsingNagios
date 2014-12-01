package com.cancaonova.parsing.vo;

public class ServiceStatusVO extends BaseVO {
	
	private String host_name;
	private String service_description;
	private String modified_attributes;
	private String check_command;
	private String check_period;
	private String notification_period;
	private String check_interval;
	private String retry_interval;
	private String event_handler;
	private String has_been_checked;
	private String should_be_scheduled;
	private String check_execution_time;
	private String check_latency;
	private String check_type;
	private String current_state;
	private String last_hard_state;
	private String last_event_id;
	private String current_event_id;
	private String current_problem_id;
	private String last_problem_id;
	private String current_attempt;
	private String max_attempts;
	private String state_type;
	private String last_state_change;
	private String last_hard_state_change;
	private String last_time_ok;
	private String last_time_warning;
	private String last_time_unknown;
	private String last_time_critical;
	private String plugin_output;
	private String long_plugin_output;
	private String performance_data;
	private String last_check;
	private String next_check;
	private String check_options;
	private String current_notification_number;
	private String current_notification_id;
	private String last_notification;
	private String next_notification;
	private String no_more_notifications;
	private String notifications_enabled;
	private String active_checks_enabled;
	private String passive_checks_enabled;
	private String event_handler_enabled;
	private String problem_has_been_acknowledged;
	private String acknowledgement_type;
	private String flap_detection_enabled;
	private String failure_prediction_enabled;
	private String process_performance_data;
	private String obsess_over_service;
	private String last_update;
	private String is_flapping;
	private String percent_state_change;
	private String scheduled_downtime_depth;
	
	public String getHost_name() {
		return host_name;
	}
	public void setHost_name(String host_name) {
		this.host_name = host_name;
	}
	public String getService_description() {
		return service_description;
	}
	public void setService_description(String service_description) {
		this.service_description = service_description;
	}
	public String getModified_attributes() {
		return modified_attributes;
	}
	public void setModified_attributes(String modified_attributes) {
		this.modified_attributes = modified_attributes;
	}
	public String getCheck_command() {
		return check_command;
	}
	public void setCheck_command(String check_command) {
		this.check_command = check_command;
	}
	public String getCheck_period() {
		return check_period;
	}
	public void setCheck_period(String check_period) {
		this.check_period = check_period;
	}
	public String getNotification_period() {
		return notification_period;
	}
	public void setNotification_period(String notification_period) {
		this.notification_period = notification_period;
	}
	public String getCheck_interval() {
		return check_interval;
	}
	public void setCheck_interval(String check_interval) {
		this.check_interval = check_interval;
	}
	public String getRetry_interval() {
		return retry_interval;
	}
	public void setRetry_interval(String retry_interval) {
		this.retry_interval = retry_interval;
	}
	public String getEvent_handler() {
		return event_handler;
	}
	public void setEvent_handler(String event_handler) {
		this.event_handler = event_handler;
	}
	public String getHas_been_checked() {
		return has_been_checked;
	}
	public void setHas_been_checked(String has_been_checked) {
		this.has_been_checked = has_been_checked;
	}
	public String getShould_be_scheduled() {
		return should_be_scheduled;
	}
	public void setShould_be_scheduled(String should_be_scheduled) {
		this.should_be_scheduled = should_be_scheduled;
	}
	public String getCheck_execution_time() {
		return check_execution_time;
	}
	public void setCheck_execution_time(String check_execution_time) {
		this.check_execution_time = check_execution_time;
	}
	public String getCheck_latency() {
		return check_latency;
	}
	public void setCheck_latency(String check_latency) {
		this.check_latency = check_latency;
	}
	public String getCheck_type() {
		return check_type;
	}
	public void setCheck_type(String check_type) {
		this.check_type = check_type;
	}
	public String getCurrent_state() {
		return current_state;
	}
	public void setCurrent_state(String current_state) {
		this.current_state = current_state;
	}
	public String getLast_hard_state() {
		return last_hard_state;
	}
	public void setLast_hard_state(String last_hard_state) {
		this.last_hard_state = last_hard_state;
	}
	public String getLast_event_id() {
		return last_event_id;
	}
	public void setLast_event_id(String last_event_id) {
		this.last_event_id = last_event_id;
	}
	public String getCurrent_event_id() {
		return current_event_id;
	}
	public void setCurrent_event_id(String current_event_id) {
		this.current_event_id = current_event_id;
	}
	public String getCurrent_problem_id() {
		return current_problem_id;
	}
	public void setCurrent_problem_id(String current_problem_id) {
		this.current_problem_id = current_problem_id;
	}
	public String getLast_problem_id() {
		return last_problem_id;
	}
	public void setLast_problem_id(String last_problem_id) {
		this.last_problem_id = last_problem_id;
	}
	public String getCurrent_attempt() {
		return current_attempt;
	}
	public void setCurrent_attempt(String current_attempt) {
		this.current_attempt = current_attempt;
	}
	public String getMax_attempts() {
		return max_attempts;
	}
	public void setMax_attempts(String max_attempts) {
		this.max_attempts = max_attempts;
	}
	public String getState_type() {
		return state_type;
	}
	public void setState_type(String state_type) {
		this.state_type = state_type;
	}
	public String getLast_state_change() {
		return last_state_change;
	}
	public void setLast_state_change(String last_state_change) {
		this.last_state_change = last_state_change;
	}
	public String getLast_hard_state_change() {
		return last_hard_state_change;
	}
	public void setLast_hard_state_change(String last_hard_state_change) {
		this.last_hard_state_change = last_hard_state_change;
	}
	public String getLast_time_ok() {
		return last_time_ok;
	}
	public void setLast_time_ok(String last_time_ok) {
		this.last_time_ok = last_time_ok;
	}
	public String getLast_time_warning() {
		return last_time_warning;
	}
	public void setLast_time_warning(String last_time_warning) {
		this.last_time_warning = last_time_warning;
	}
	public String getLast_time_unknown() {
		return last_time_unknown;
	}
	public void setLast_time_unknown(String last_time_unknown) {
		this.last_time_unknown = last_time_unknown;
	}
	public String getLast_time_critical() {
		return last_time_critical;
	}
	public void setLast_time_critical(String last_time_critical) {
		this.last_time_critical = last_time_critical;
	}
	public String getPlugin_output() {
		return plugin_output;
	}
	public void setPlugin_output(String plugin_output) {
		this.plugin_output = plugin_output;
	}
	public String getLong_plugin_output() {
		return long_plugin_output;
	}
	public void setLong_plugin_output(String long_plugin_output) {
		this.long_plugin_output = long_plugin_output;
	}
	public String getPerformance_data() {
		return performance_data;
	}
	public void setPerformance_data(String performance_data) {
		this.performance_data = performance_data;
	}
	public String getLast_check() {
		return last_check;
	}
	public void setLast_check(String last_check) {
		this.last_check = last_check;
	}
	public String getNext_check() {
		return next_check;
	}
	public void setNext_check(String next_check) {
		this.next_check = next_check;
	}
	public String getCheck_options() {
		return check_options;
	}
	public void setCheck_options(String check_options) {
		this.check_options = check_options;
	}
	public String getCurrent_notification_number() {
		return current_notification_number;
	}
	public void setCurrent_notification_number(String current_notification_number) {
		this.current_notification_number = current_notification_number;
	}
	public String getCurrent_notification_id() {
		return current_notification_id;
	}
	public void setCurrent_notification_id(String current_notification_id) {
		this.current_notification_id = current_notification_id;
	}
	public String getLast_notification() {
		return last_notification;
	}
	public void setLast_notification(String last_notification) {
		this.last_notification = last_notification;
	}
	public String getNext_notification() {
		return next_notification;
	}
	public void setNext_notification(String next_notification) {
		this.next_notification = next_notification;
	}
	public String getNo_more_notifications() {
		return no_more_notifications;
	}
	public void setNo_more_notifications(String no_more_notifications) {
		this.no_more_notifications = no_more_notifications;
	}
	public String getNotifications_enabled() {
		return notifications_enabled;
	}
	public void setNotifications_enabled(String notifications_enabled) {
		this.notifications_enabled = notifications_enabled;
	}
	public String getActive_checks_enabled() {
		return active_checks_enabled;
	}
	public void setActive_checks_enabled(String active_checks_enabled) {
		this.active_checks_enabled = active_checks_enabled;
	}
	public String getPassive_checks_enabled() {
		return passive_checks_enabled;
	}
	public void setPassive_checks_enabled(String passive_checks_enabled) {
		this.passive_checks_enabled = passive_checks_enabled;
	}
	public String getEvent_handler_enabled() {
		return event_handler_enabled;
	}
	public void setEvent_handler_enabled(String event_handler_enabled) {
		this.event_handler_enabled = event_handler_enabled;
	}
	public String getProblem_has_been_acknowledged() {
		return problem_has_been_acknowledged;
	}
	public void setProblem_has_been_acknowledged(
			String problem_has_been_acknowledged) {
		this.problem_has_been_acknowledged = problem_has_been_acknowledged;
	}
	public String getAcknowledgement_type() {
		return acknowledgement_type;
	}
	public void setAcknowledgement_type(String acknowledgement_type) {
		this.acknowledgement_type = acknowledgement_type;
	}
	public String getFlap_detection_enabled() {
		return flap_detection_enabled;
	}
	public void setFlap_detection_enabled(String flap_detection_enabled) {
		this.flap_detection_enabled = flap_detection_enabled;
	}
	public String getFailure_prediction_enabled() {
		return failure_prediction_enabled;
	}
	public void setFailure_prediction_enabled(String failure_prediction_enabled) {
		this.failure_prediction_enabled = failure_prediction_enabled;
	}
	public String getProcess_performance_data() {
		return process_performance_data;
	}
	public void setProcess_performance_data(String process_performance_data) {
		this.process_performance_data = process_performance_data;
	}
	public String getObsess_over_service() {
		return obsess_over_service;
	}
	public void setObsess_over_service(String obsess_over_service) {
		this.obsess_over_service = obsess_over_service;
	}
	public String getLast_update() {
		return last_update;
	}
	public void setLast_update(String last_update) {
		this.last_update = last_update;
	}
	public String getIs_flapping() {
		return is_flapping;
	}
	public void setIs_flapping(String is_flapping) {
		this.is_flapping = is_flapping;
	}
	public String getPercent_state_change() {
		return percent_state_change;
	}
	public void setPercent_state_change(String percent_state_change) {
		this.percent_state_change = percent_state_change;
	}
	public String getScheduled_downtime_depth() {
		return scheduled_downtime_depth;
	}
	public void setScheduled_downtime_depth(String scheduled_downtime_depth) {
		this.scheduled_downtime_depth = scheduled_downtime_depth;
	}
	
}
