package com.cancaonova.parsing.vo;

public class ProgramStatusVO extends BaseVO {

	private String modified_host_attributes;
	private String modified_service_attributes;
	private String nagios_pid;
	private String daemon_mode;
	private String program_start;
	private String last_command_check;
	private String last_log_rotation;
	private String enable_notifications;
	private String active_service_checks_enabled;
	private String passive_service_checks_enabled;
	private String active_host_checks_enabled;
	private String passive_host_checks_enabled;
	private String enable_event_handlers;
	private String obsess_over_services;
	private String obsess_over_hosts;
	private String check_service_freshness;
	private String check_host_freshness;
	private String enable_flap_detection;
	private String enable_failure_prediction;
	private String process_performance_data;
	private String global_host_event_handler;
	private String global_service_event_handler;
	private String next_comment_id;
	private String next_downtime_id;
	private String next_event_id;
	private String next_problem_id;
	private String next_notification_id;
	private String total_external_command_buffer_slots;
	private String used_external_command_buffer_slots;
	private String high_external_command_buffer_slots;
	private String active_scheduled_host_check_stats;
	private String active_ondemand_host_check_stats;
	private String passive_host_check_stats;
	private String active_scheduled_service_check_stats;
	private String active_ondemand_service_check_stats;
	private String passive_service_check_stats;
	private String cached_host_check_stats;
	private String cached_service_check_stats;
	private String external_command_stats;
	private String parallel_host_check_stats;
	private String serial_host_check_stats;
	
	public String getModified_host_attributes() {
		return modified_host_attributes;
	}
	public void setModified_host_attributes(String modified_host_attributes) {
		this.modified_host_attributes = modified_host_attributes;
	}
	public String getModified_service_attributes() {
		return modified_service_attributes;
	}
	public void setModified_service_attributes(String modified_service_attributes) {
		this.modified_service_attributes = modified_service_attributes;
	}
	public String getNagios_pid() {
		return nagios_pid;
	}
	public void setNagios_pid(String nagios_pid) {
		this.nagios_pid = nagios_pid;
	}
	public String getDaemon_mode() {
		return daemon_mode;
	}
	public void setDaemon_mode(String daemon_mode) {
		this.daemon_mode = daemon_mode;
	}
	public String getProgram_start() {
		return program_start;
	}
	public void setProgram_start(String program_start) {
		this.program_start = program_start;
	}
	public String getLast_command_check() {
		return last_command_check;
	}
	public void setLast_command_check(String last_command_check) {
		this.last_command_check = last_command_check;
	}
	public String getLast_log_rotation() {
		return last_log_rotation;
	}
	public void setLast_log_rotation(String last_log_rotation) {
		this.last_log_rotation = last_log_rotation;
	}
	public String getEnable_notifications() {
		return enable_notifications;
	}
	public void setEnable_notifications(String enable_notifications) {
		this.enable_notifications = enable_notifications;
	}
	public String getActive_service_checks_enabled() {
		return active_service_checks_enabled;
	}
	public void setActive_service_checks_enabled(
			String active_service_checks_enabled) {
		this.active_service_checks_enabled = active_service_checks_enabled;
	}
	public String getPassive_service_checks_enabled() {
		return passive_service_checks_enabled;
	}
	public void setPassive_service_checks_enabled(
			String passive_service_checks_enabled) {
		this.passive_service_checks_enabled = passive_service_checks_enabled;
	}
	public String getActive_host_checks_enabled() {
		return active_host_checks_enabled;
	}
	public void setActive_host_checks_enabled(String active_host_checks_enabled) {
		this.active_host_checks_enabled = active_host_checks_enabled;
	}
	public String getPassive_host_checks_enabled() {
		return passive_host_checks_enabled;
	}
	public void setPassive_host_checks_enabled(String passive_host_checks_enabled) {
		this.passive_host_checks_enabled = passive_host_checks_enabled;
	}
	public String getEnable_event_handlers() {
		return enable_event_handlers;
	}
	public void setEnable_event_handlers(String enable_event_handlers) {
		this.enable_event_handlers = enable_event_handlers;
	}
	public String getObsess_over_services() {
		return obsess_over_services;
	}
	public void setObsess_over_services(String obsess_over_services) {
		this.obsess_over_services = obsess_over_services;
	}
	public String getObsess_over_hosts() {
		return obsess_over_hosts;
	}
	public void setObsess_over_hosts(String obsess_over_hosts) {
		this.obsess_over_hosts = obsess_over_hosts;
	}
	public String getCheck_service_freshness() {
		return check_service_freshness;
	}
	public void setCheck_service_freshness(String check_service_freshness) {
		this.check_service_freshness = check_service_freshness;
	}
	public String getCheck_host_freshness() {
		return check_host_freshness;
	}
	public void setCheck_host_freshness(String check_host_freshness) {
		this.check_host_freshness = check_host_freshness;
	}
	public String getEnable_flap_detection() {
		return enable_flap_detection;
	}
	public void setEnable_flap_detection(String enable_flap_detection) {
		this.enable_flap_detection = enable_flap_detection;
	}
	public String getEnable_failure_prediction() {
		return enable_failure_prediction;
	}
	public void setEnable_failure_prediction(String enable_failure_prediction) {
		this.enable_failure_prediction = enable_failure_prediction;
	}
	public String getProcess_performance_data() {
		return process_performance_data;
	}
	public void setProcess_performance_data(String process_performance_data) {
		this.process_performance_data = process_performance_data;
	}
	public String getGlobal_host_event_handler() {
		return global_host_event_handler;
	}
	public void setGlobal_host_event_handler(String global_host_event_handler) {
		this.global_host_event_handler = global_host_event_handler;
	}
	public String getGlobal_service_event_handler() {
		return global_service_event_handler;
	}
	public void setGlobal_service_event_handler(String global_service_event_handler) {
		this.global_service_event_handler = global_service_event_handler;
	}
	public String getNext_comment_id() {
		return next_comment_id;
	}
	public void setNext_comment_id(String next_comment_id) {
		this.next_comment_id = next_comment_id;
	}
	public String getNext_downtime_id() {
		return next_downtime_id;
	}
	public void setNext_downtime_id(String next_downtime_id) {
		this.next_downtime_id = next_downtime_id;
	}
	public String getNext_event_id() {
		return next_event_id;
	}
	public void setNext_event_id(String next_event_id) {
		this.next_event_id = next_event_id;
	}
	public String getNext_problem_id() {
		return next_problem_id;
	}
	public void setNext_problem_id(String next_problem_id) {
		this.next_problem_id = next_problem_id;
	}
	public String getNext_notification_id() {
		return next_notification_id;
	}
	public void setNext_notification_id(String next_notification_id) {
		this.next_notification_id = next_notification_id;
	}
	public String getTotal_external_command_buffer_slots() {
		return total_external_command_buffer_slots;
	}
	public void setTotal_external_command_buffer_slots(
			String total_external_command_buffer_slots) {
		this.total_external_command_buffer_slots = total_external_command_buffer_slots;
	}
	public String getUsed_external_command_buffer_slots() {
		return used_external_command_buffer_slots;
	}
	public void setUsed_external_command_buffer_slots(
			String used_external_command_buffer_slots) {
		this.used_external_command_buffer_slots = used_external_command_buffer_slots;
	}
	public String getHigh_external_command_buffer_slots() {
		return high_external_command_buffer_slots;
	}
	public void setHigh_external_command_buffer_slots(
			String high_external_command_buffer_slots) {
		this.high_external_command_buffer_slots = high_external_command_buffer_slots;
	}
	public String getActive_scheduled_host_check_stats() {
		return active_scheduled_host_check_stats;
	}
	public void setActive_scheduled_host_check_stats(
			String active_scheduled_host_check_stats) {
		this.active_scheduled_host_check_stats = active_scheduled_host_check_stats;
	}
	public String getActive_ondemand_host_check_stats() {
		return active_ondemand_host_check_stats;
	}
	public void setActive_ondemand_host_check_stats(
			String active_ondemand_host_check_stats) {
		this.active_ondemand_host_check_stats = active_ondemand_host_check_stats;
	}
	public String getPassive_host_check_stats() {
		return passive_host_check_stats;
	}
	public void setPassive_host_check_stats(String passive_host_check_stats) {
		this.passive_host_check_stats = passive_host_check_stats;
	}
	public String getActive_scheduled_service_check_stats() {
		return active_scheduled_service_check_stats;
	}
	public void setActive_scheduled_service_check_stats(
			String active_scheduled_service_check_stats) {
		this.active_scheduled_service_check_stats = active_scheduled_service_check_stats;
	}
	public String getActive_ondemand_service_check_stats() {
		return active_ondemand_service_check_stats;
	}
	public void setActive_ondemand_service_check_stats(
			String active_ondemand_service_check_stats) {
		this.active_ondemand_service_check_stats = active_ondemand_service_check_stats;
	}
	public String getPassive_service_check_stats() {
		return passive_service_check_stats;
	}
	public void setPassive_service_check_stats(String passive_service_check_stats) {
		this.passive_service_check_stats = passive_service_check_stats;
	}
	public String getCached_host_check_stats() {
		return cached_host_check_stats;
	}
	public void setCached_host_check_stats(String cached_host_check_stats) {
		this.cached_host_check_stats = cached_host_check_stats;
	}
	public String getCached_service_check_stats() {
		return cached_service_check_stats;
	}
	public void setCached_service_check_stats(String cached_service_check_stats) {
		this.cached_service_check_stats = cached_service_check_stats;
	}
	public String getExternal_command_stats() {
		return external_command_stats;
	}
	public void setExternal_command_stats(String external_command_stats) {
		this.external_command_stats = external_command_stats;
	}
	public String getParallel_host_check_stats() {
		return parallel_host_check_stats;
	}
	public void setParallel_host_check_stats(String parallel_host_check_stats) {
		this.parallel_host_check_stats = parallel_host_check_stats;
	}
	public String getSerial_host_check_stats() {
		return serial_host_check_stats;
	}
	public void setSerial_host_check_stats(String serial_host_check_stats) {
		this.serial_host_check_stats = serial_host_check_stats;
	}
	
}
